pipeline { 
    agent any 
    tools {
        maven 'MAVEN_HOME'
    } 
    stages { 
   		 stage('clean') { 
            steps { 
               sh 'mvn clean'
            }
        }
        stage('compile') { 
            steps { 
               sh 'mvn clean'
            }
        }
        stage('build') { 
            steps { 
               sh 'mvn install'
            }
        }
    }
}