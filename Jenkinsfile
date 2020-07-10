pipeline {
  agent any

  tools {
    maven 'mvn-3.5.4'
  }

  stages {
    stage('Build') {
      steps {
        sh "mvn clean spring-boot:repackage"
      }
    }
  }

  post {
    slways {
      archiveArtifacts artifacts: 'target/**/*.jar', fingeroprint: true
    }
  }
}