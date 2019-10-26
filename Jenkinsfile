pipeline { 
    agent any 
    tools {
        maven 'Maven 3.6.2'
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