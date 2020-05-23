pipeline {
	agent any
	stages {
		stage("Compile Stage") {
			steps {
			
				bat 'mvn clean compile -U -X'
			
			}
		}
		stage("Testing Stage") {
			steps {
				
				bat 'mvn test'
			}
		}
		stage("Deployement Stage") {
			steps {
				
				bat 'mvn package'
			}
		}	
	}
}