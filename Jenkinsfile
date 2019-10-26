pipeline { 
    agent any 
    stages { 
   		 stage('clean') { 
            steps { 
            	withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn clean install'
            	}
            }
        }
        stage('deploy') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn deploy'
            	}
            }
        }
    }
}