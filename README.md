<b><h1>Documentação do Projeto: Testador de Display Android</h1></b>
<b><h2>Introdução</h2></b>
Este documento descreve o projeto Android desenvolvido em Kotlin que tem como objetivo testar diferentes áreas do display de um dispositivo móvel para verificar sua funcionalidade.

<b><h2>Tecnologias Utilizadas</h2></b>
<b>Kotlin:</b> Linguagem de programação moderna e concisa para o desenvolvimento Android.

<b>RecyclerView:</b> Componente do Android para exibir listas de elementos de forma eficiente.

<b>ConstraintLayout:</b> Biblioteca de layout que permite criar interfaces de usuário complexas e responsivas.
<b><h2>Estrutura do Projeto</h2></b>
O projeto é composto pelas seguintes partes principais:

<b>MainActivity</b>
A MainActivity é responsável por inicializar o RecyclerView e configurar o adaptador correspondente.

<b>TestAdapter</b>
O TestAdapter é um adaptador personalizado para o RecyclerView que gerencia a exibição dos testes de display.

<b>TestViewHolder</b>
O TestViewHolder mantém as referências para os componentes de UI que serão atualizados durante o teste.

<b>item_test.xml</b>
O arquivo item_test.xml define o layout para cada item individual no RecyclerView.

<b>activity_main.xml</b>
O arquivo activity_main.xml utiliza ConstraintLayout para definir o layout da MainActivity.

<b><h2>Funcionalidades</h2></b>
O aplicativo realiza os seguintes testes no display:

<b>Teste de Cores:</b> Exibe cores sólidas para identificar pixels mortos.

<b>Teste de Padrões:</b> Mostra diferentes padrões para verificar a uniformidade do display.

<b>Teste de Toque:</b> Registra toques na tela para verificar a sensibilidade do display.
<b><h2>Desenvolvimento</h2></b>
O desenvolvimento foi realizado seguindo as melhores práticas de programação em Kotlin, com foco na modularidade e reutilização de código.

<b><h2>Testes</h2></b>
Os testes foram conduzidos em diversos dispositivos para garantir a compatibilidade e a eficácia do aplicativo.

<b><h2>Conclusão</h2></b>
O aplicativo provou ser uma ferramenta útil para diagnosticar problemas no display de dispositivos Android. O uso de Kotlin, RecyclerView e ConstraintLayout permitiu criar uma experiência de usuário suave e interativa.
