# Conversor de Monedas Con Java y Exchange Rate API
<p>Este proyecto fue realizado para aprender a como consumir una API y como poder obtener datos de ella para asi poder hacer distintas operaciones.</p>

<p>
  Dentro de este proyecto utilizamos lo siguiente:
</p>
<ul>
  <li>Gson</li>
  <li>Exchange Rate API</li>
  <li>HttpClient</li>
  <li>HttpRequest</li>
  <li>HttpResponse</li>
</ul>

## ¿Como funciona?
<p>
Esta pequeña aplicacion nos permite convertir diferentes divisas como lo podemos ver en la siguiente imagen:
</p>

![menu.PNG](imagenes%2Fmenu.PNG)

<p>
en  la cual seleccionaremos alguna de nusestras opciones a convertir inmediatamente nos pregunatara el monto a convertir y realizara la operacion desada, 
como se puede observar en la siguiente imagen:
</p>

![conversion.PNG](imagenes%2Fconversion.PNG)

## ¿Como utilzar la API?

<p>
La API seleccionada para este proyecto fue Exchange Rate API, la cual tiene como fin poder proporcionarnos informacion acerca de el tipo de cambio de diferentes tipos de divisas
para fines practicos se eligieron tres tipos de monedas, las cuales fueron el Peso Colombiano, el Peso Chileno y el Real Brazileño los cuales lo comparamos con el Dolar Estadounidence, 
para lo cual cree una clase la cual me permitia consultar por medio de parametros cual era el tipo de de moneda y su conversion a diferenes tipos de divisas,
a continuacion voy a mostrar un poco de esta clase:
</p>

![consultarApi.PNG](imagenes%2FconsultarApi.PNG)

<p>
En resumen esta aplicacion se basa en el cosnumo de esta consulta en la cual paso por medio de la URL el tipo de moneda al cual voy a utilizar,
despues con el uso de Gson puedo darle formato de un archivo JSON y puedo buscar por medio del metodo get que moneda o divisa quiero convertir.
</p>