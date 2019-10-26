pipeline { 
    agent any 
    stages { 
   		 stage('clean') { 
            steps { 
            	withMaven(maven : 'MAVEN_HOME')
            	{
            		 sh 'mvn clean install'
            	}
            }
        }
        stage('deploy') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 sh 'mvn deploy'
            	}
            }
        }
    }
}