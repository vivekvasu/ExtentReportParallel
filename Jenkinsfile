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
        stage('Email Notification') { 
         steps { 
           	mail bcc: '', body: '''Hello Team ,
           
     Please find below the results

     Thanks,
     Jenkins''', cc: 'vivekvivi39@gmail.com', from: 'vivekvivi39@gmail.com', replyTo: '', subject: 'TEST AUTOMATION - JENKINS NOTIFICATION', to: 'vivekvivi39@gmail.com'
       		}
        }
    }
    post {
   		 failure {
        		mail to: 'vivekvivi39@gmail.com',
             	subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
            	body: "Something is wrong with ${env.BUILD_URL}"
    			}
		}
}