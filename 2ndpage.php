<html>
    <head>
        <style>
            /*type selection
            div{
            background-color:red;
            }*/
            /*alter selection */
            /*div[class]{
                background-color:red;
            }*/
            /*div[class ="myclass"]{
                background-color:red;
            } */
            /*div[class ~="myclass"]{
                background-color:red;
            }*/
            /*div[class ^="my"]{
                background-color:red;
            } */
            /*div[class $="Anotherclass"]{
                background-color:red;
            } */
            div[class *="ass"]{
                background-color:red;
            }
        </style>
    </head>
    <body>
        <div class="myclass">This is div 1</div>
        <div class="myclass">This is div 2</div>
        <div class="myclass">This is div 3</div>
        <div class="myclass">This is div 4</div>
        <div class="myclass">This is div 5</div>
        <div class="myAnotherclass">This is div 6</div>
        <div class="notMyclass">This is div 7</div>
        <div class="myclass myAnotherclass">This is div 8</div>
        <p>this is a P</p>


    </body>
</html>

