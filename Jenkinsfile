pipeline { 
    agent any 
    stages { 
   		 stage('Clean Directory') { 
            steps { 
            	withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn clean'
            	}
            }
        }
        stage('Compile Build') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn install'
            	}
            }
        }
    }
}