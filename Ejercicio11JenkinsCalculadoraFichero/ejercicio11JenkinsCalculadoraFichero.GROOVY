pipeline {
    agent any
    environment{
        def numero1=20
        def numero2=10 // Si quiere probar el caso de la división por cero, asigne cero a variable <<numero2>> en lugar de 10.
        def resultadoSuma=0
        def resultadoResta=0
        def resultadoProducto=0
        def resultadoDivision=0
    }  

    stages {
        stage("Suma") {
        steps {
            script {
                resultadoSuma=numero1.toInteger()+numero2.toInteger()
                println "La suma ${numero1} y ${numero2} es ${resultadoSuma}"
            }
            
        }
    }
    stage("Resta") {
        steps {
            script {
                resultadoResta=numero1.toInteger()-numero2.toInteger()
                println "La resta ${numero1} y ${numero2} es ${resultadoResta}"
            }
            
        }
    }
      stage("Producto") {
        steps {
            script {
                resultadoProducto=numero1.toInteger()*numero2.toInteger()
                println "El producto de ${numero1} y ${numero2} es ${resultadoProducto}"
            }
            
        }
    }
    stage("Division") {
        steps {
            script {
                if(numero2.toInteger()==0) {
                    resultadoDivision="No se puede dividir entre cero"
                    println resultadoDivision
                } else {
                    resultadoDivision=numero1.toInteger()/numero2.toInteger()
                    println "La división de ${numero1} y ${numero2} es ${resultadoDivision}"
                }
                
            }
            
        }
    }
    
      stage("EscribeFicheroInfoCalculadora") {
        steps {
                script
                {
                    
                    def informacion = "Los resultados de las operaciones con los números ${numero1} y ${numero2} son:\n" + 
                    "Suma: ${resultadoSuma}\n" + "Resta: ${resultadoResta}\n" + "Producto: ${resultadoProducto}\n" + "División: ${resultadoDivision}\n"
                    
                    writeFile(file: "calculadora.txt", text: informacion)
                }
    }

      }
    stage("LecturaFichero") {
        steps
        {
            script
            {
                def data = readFile(file: "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Ejercicio11CalculadoraFichero\\calculadora.txt")
                println data
            }
        }
        }




    }


}