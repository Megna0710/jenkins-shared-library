
def call(String reponame) {
    git "${reponame}"
    sh 'mvn clean package'
}
