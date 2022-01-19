pipeline {
    agent any
    
    tools{
    	maven "3.6.0"
    }
    stages {
        stage("Build") {
            steps {
                sh "mvn clean package -Dmaven.test.skip=true"
            }
        }
    }
    
    post {
    	always
    	{
    		cleanWs()
    	}
     
    }
       
}