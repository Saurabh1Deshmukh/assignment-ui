#!groovy

pipeline {
    agent any

    tools {
        maven "3.6.0" // You need to add a maven with name "3.6.0" in the Global Tools Configuration page
    }
    
    triggers {
    	githubPush()
  	}    

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean package -Dmaven.test.skip=true"
            }
        }
        
                stage('Build Docker Image'){
	     steps {
     		 sh "docker build -t saurabh1deshmukh/assignment-backend:1.0.0 ."
	     }
   		}
   		
   		stage("Push Docker Image"){
			steps {
				sh "docker login -u ${DOCKER_COMMON_CREDS_USR} -p ${DOCKER_COMMON_CREDS_PSW}"
				sh "docker push saurabh1deshmukh/assignment-backend:1.0.0"
			}
   		}
   		
   		stage("Deploy to Docker Environment"){
			steps {
				sshagent(["aws-cred"]) {
   					sh "ssh -o StrictHostKeyChecking=no ec2-user@172.31.38.88 docker run -d -p 8282:8282 --name assignment-backend saurabh1deshmukh/assignment-backend:1.0.0"
				}
			}
   		}
    }

    post {
        always {
            cleanWs()
        }
    }
}
