pipeline {
    agent {label "maven"}
    
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