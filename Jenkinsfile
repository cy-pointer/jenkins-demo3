pipeline {
  agent any

  tools {
    maven 'mvn-3.5.4'
  }

  stages {
    stage('Build') {
      steps {
        sh "mvn clean package"
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'target/**/*.jar', fingerprint: true
    }
  }
}