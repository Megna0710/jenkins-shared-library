
import org.apache.commons.lang.StringUtils

def call(String keyword, int threshold) {
    def logText = currentBuild.rawBuild.getLog(10000).join('\n')
    int count = StringUtils.countMatches(logText, keyword)

    echo "Found ${count} occurrences of '${keyword}' in the build log."

    if (count > threshold) {
        currentBuild.result = 'UNSTABLE'
        echo "Build marked UNSTABLE: '${keyword}' count (${count}) exceeds threshold (${threshold})."
    }
}
