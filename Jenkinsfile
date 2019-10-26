pipeline { 
    agent any 
    stages { 
   		 stage('clean') { 
            steps { 
            	withMaven(maven : 'MAVEN_HOME')
            	{
            		 sh 'mvn clean'
            	}
            }
        }
        stage('compile') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 sh 'mvn compile'
            	}
            }
        }
        stage('build') { 
            steps { 
               withMaven(maven : 'MAVEN_HOME')
            	{
            		 sh 'mvn install'
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