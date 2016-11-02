# Star Trek Rescue Service

A Frota Estelar recebeu um pedido de resgate de uma tripulação perdida em um planeta desabitado.

Porém, devido a nave ter sido muito danificada na queda, a tripulação de 3 pesquisadores se separou e somente conseguiu enviar parte da informação sobre a sua localização.

Com base nessas informações, a Frota Estelar conseguiu identificar que os tripulantes estavam separados aleatoriamente em 3 pontos de uma planície de 10x10 ao Norte do planeta.

A USS Enterprise tem que marcar a posição dos usuários lançando sinalizadores nas possíveis posições onde os tripulantes estejam, para que as equipes de busca os encontrem. 

Você, como parte da equipe de engenharia da USS Enterprise, tem que desenvolver esse sistema que, mapeando a planície em formato de malha, dispare sinalizadores para pontos da planície (usando como referência pontos dos eixos x, y), um sinalizador indicando a posição. Os sinalizadores devem ser lançados um de cada vez, aguardando o retorno do anterior lançado.

O sinalizador ao chegar no ponto informado, deve informar se localizou algum
tripulante (Usando o X ).

Caso não tenha encontrado, ele rastreará as áreas adjacentes ao ponto que ele chegou, o alcance é de uma área, informando se em alguma delas existe um tripulante (marcando com um ! ). 

Observe que há uma imprecisão no sinalizador, então ele marca as áreas adjacentes em comum aos dos dois pontos, sinalizador e tripulante.
	Se não encontrar nada naquele ponto e nas respectivas áreas adjacentes marque com * para mapear a malha com mais precisão.
	
	O sistema deverá prover uma API REST que permita ser acessada de qualquer sede da Frota Estelar via URLs. Dessa forma, as equipes de resgate conseguirão acionar o serviço de qualquer lugar e terão maiores recursos, uma vez que usaremos toda a infraestrutura do QG da Frota Estelar.

# Desenvolvimento

Para o desenvolvimento da proposta, foi utilizado Java 7 com abordagem TDD e as seguintes tecnologias:
-	**JUnit** para os testes
-	**Maven** para gerenciamento de dependências
-	**Log4j** para log do serviço Rest
-	**Swagger** para descrição do serviço

# Documentação

A documentação do projeto esta na pasta doc desde repositório


  
