# Test_Automation

Proyecto de automatización en serenity screenplay y cucumber para la compra de un producto en la pagina http://automationpractice.com/index.php

En este proyecto se podrá observar cómo se automatizo la prueba de buscar un producto en la página definida, agregarlo al carrito de compras y validar que se halla agregado exitosamente el producto.

En este proyecto se implementó Cucumber ya que es una manera eficaz de definir el escenario utilizando la notación gherkin.

Se utilizó el patrón de diseño Serenity Screenplay (http://serenity-bdd.info/docs/articles/screenplay-tutorial.html) para darle eficiencia a la automatización.

-src.main.java.com.test.automation
------questions
------tasks
------user_interfac

-src.test.java.com.test.automation
------Runners
------step_definitions

-src.test.resources
----test.feature.web


Se utilizó Gradle (https://gradle.org/) para la compilación y ejecución de la automatización.
se puede ejecutar el excript con el siguiente comando para comenzar la ejecucion y generar el reporte de serenity de la prueba realizada:
gradle clean test aggregate --info


Saludos!
