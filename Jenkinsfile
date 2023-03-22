#!/bin/bash -l

pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'technozure'
        DOCKER_IMAGE_TAG = 'latest'
        MAVEN_HOME = '/Users/jaiprakash/Downloads/apache-maven-3.9.0'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Clean') {
            steps {
            sh "${MAVEN_HOME}/bin/mvn clean"
            }
        }

        stage('Compile') {
            steps {
                sh '${MAVEN_HOME}/bin/mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh '${MAVEN_HOME}/bin/mvn test'
            }
        }

        stage('Package') {
            steps {
                sh '${MAVEN_HOME}/bin/mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG} ."
            }
        }

        stage('Publish Docker Image') {
            steps {
                sh "docker run -d -p 9000:8080 --name my-app-container ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}"
            }
        }
    }
}
