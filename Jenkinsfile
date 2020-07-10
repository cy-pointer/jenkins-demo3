pipeline {
  agent any

  tools {
    maven 'mvn-3.5.4'
  }

  stages {
    stage('Build') {
      steps {
        sh "mvn clean test package"
        nexusPublisher (
         nexusInstanceId: 'nexus3',
         nexusRepositoryId: 'maven-release',
         packages: [
            [
            $class: 'MavenPackage',
            mavenAssetList: [
                [classifier: '',
                    extension: '',
                    filePath: './target/jenkins-demo3-0.0.1-SNAPSHOT.jar'
                ]
            ],// end of mavenAssetList
            mavenCoordinate: [
                artifactId: 'jenkins-demo3',
                groupId: 'org.ting',
                packaging: 'jar',version: '1.0'
                ]
            ] // end of packages
         ])
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'target/**/*.jar', fingerprint: true
    }
  }
}