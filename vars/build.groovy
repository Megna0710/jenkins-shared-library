
def call(String action) {
    if (action == 'Clean') {
        sh 'mvn clean'
    } else if (action == 'Compile') {
        sh 'mvn compile'
    } else if (action == 'Test') {
        sh 'mvn test'
    } else if (action == 'Install') {
        sh 'mvn install'
    } else {
        error "Unsupported build action: '${action}'. Use Clean, Compile, Test, or Install."
    }
}
