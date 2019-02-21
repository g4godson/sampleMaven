pipeline {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                
                withMaven(maven : 'maven')
                bat  'mvn clean package'

                
            }

            post{
                success{
                    echo 'Now Archiving ....'

                    archiveArtifacts artifacts : '**/*.war'
                }
            }
        }

        stage ('Testing Stage') {
            steps {
               
                withMaven(maven : 'maven')
                bat  'mvn test'

              
            }

        }


        
    }
}
