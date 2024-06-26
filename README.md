Documentação do Projeto: Testador de Display Android
Introdução
Este documento descreve o projeto Android desenvolvido em Kotlin que tem como objetivo testar diferentes áreas do display de um dispositivo móvel para verificar sua funcionalidade.

Tecnologias Utilizadas
Kotlin: Linguagem de programação moderna e concisa para o desenvolvimento Android.
RecyclerView: Componente do Android para exibir listas de elementos de forma eficiente.
ConstraintLayout: Biblioteca de layout que permite criar interfaces de usuário complexas e responsivas.
Estrutura do Projeto
O projeto é composto pelas seguintes partes principais:

MainActivity
A MainActivity é responsável por inicializar o RecyclerView e configurar o adaptador correspondente.

TestAdapter
O TestAdapter é um adaptador personalizado para o RecyclerView que gerencia a exibição dos testes de display.

TestViewHolder
O TestViewHolder mantém as referências para os componentes de UI que serão atualizados durante o teste.

item_test.xml
O arquivo item_test.xml define o layout para cada item individual no RecyclerView.

activity_main.xml
O arquivo activity_main.xml utiliza ConstraintLayout para definir o layout da MainActivity.

Funcionalidades
O aplicativo realiza os seguintes testes no display:

Teste de Cores: Exibe cores sólidas para identificar pixels mortos.
Teste de Padrões: Mostra diferentes padrões para verificar a uniformidade do display.
Teste de Toque: Registra toques na tela para verificar a sensibilidade do display.
Desenvolvimento
O desenvolvimento foi realizado seguindo as melhores práticas de programação em Kotlin, com foco na modularidade e reutilização de código.

Testes
Os testes foram conduzidos em diversos dispositivos para garantir a compatibilidade e a eficácia do aplicativo.

Conclusão
O aplicativo provou ser uma ferramenta útil para diagnosticar problemas no display de dispositivos Android. O uso de Kotlin, RecyclerView e ConstraintLayout permitiu criar uma experiência de usuário suave e interativa.
