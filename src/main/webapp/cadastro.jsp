<html>
 <head>
   <meta http-equiv="Content-Type"
   content="text/html; charset=UTF-8">
   <style>
       div{
          background-color: red
       }

   </style>

 </head>
<body>
 <form id="dados" action="recebedadoscadastro.jsp" method="POST">
     <label for="nome">Nome</label>
     <input  id="nome" type="text" name="nome" />

     <label for="sobreNome">Sobrenome</label>
     <input id="sobreNome" type="text" name="sobreNome" />

     <label for="idade">Idade</label>
     <input id="idade" type="number" name="idade" />

     <button onclick=salvar()>Enviar</button>
 </form>

 <script>
     function salvar(){
        /* document.getElementById('dados').addEventListener('submit', function(event){
              event.preventDefault()
         })*/
         event.preventDefault()

        var nome = document.getElementById('nome')
        if(nome.value == ''){
          alert('Informe nome')
          nome.focus()
          return 
        }

        var sobreNome = document.getElementById('sobreNome')
        if(sobreNome.value == ''){
          alert('Informe sobrenome')
          sobreNome.focus()
          return 
        }

        var idade = document.getElementById('idade')
        if(idade.value == ''){
          alert('Informe idade')
          idade.focus()
          return 
        }

        document.getElementById("dados").submit()
     }
 </script>
</body>
</html>