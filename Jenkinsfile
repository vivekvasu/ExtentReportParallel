pipeline { 
    agent any 
    stages { 
   		 stage('clean') { 
            steps { 
            	withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn clean'
            	}
            }
        }
        stage('compile') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 bat 'mvn install'
            	}
            }
        }
    }
}