def call(Boolean continueBuild = true ) {
    echo 'Ejecución de las pruebas de calidad de código'
    timeout(activity: true, time: 5) {
        if (!continueBuild) {
            currentBuild.result = 'ABORTED'
            error('Stopping early…')
        } else {
            return 'Tiempo cumplido'
        }
        
    }
}