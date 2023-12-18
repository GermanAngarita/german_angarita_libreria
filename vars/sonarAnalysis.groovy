def call() {
    echo 'Ejecución de las pruebas de calidad de código'
    timeout(activity: true, time: 5) {
        return 'Tiempo cumplido'
    }
}