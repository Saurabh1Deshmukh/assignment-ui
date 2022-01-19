pipeline {
    agent any
    
    tools{
    	maven "3.6.0"
    }
    stages {
        stage("Build") {
            steps {
                bat "mvn clean package -Dmaven.test.skip=true"
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