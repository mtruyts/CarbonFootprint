# CarbonFootprint

Fatec - São José dos Campos

Trabalho Prático para a disciplina - Programação Orientada a Objetos

1. Governos e empresas em todo o mundo estão cada vez mais preocupados com as pegadas
de carbono (liberações anuais de dióxido de carbono na atmosfera) a partir de edifícios que
queimam vários tipos de combustíveis para aquecimento, veículos que queimam combustíveis
para obter energia etc. Muitos cientistas culpam esses gases do efeito estufa pelo fenômeno
chamado de aquecimento global.
Usando as interfaces, você pode especifícar comportamentos semelhantes para as classes possivelmente
díspares.
1. Crie três classes pequenas não relacionadas por meio de herança - as classes Building,
Car e Bicycle. Dê a cada classe alguns atributos e comportamentos adequados únicos
que ela não tem em comum com outras classes.
2. Escreva uma interface de CarbonFootprint com um método getCarbonFootprint.
3. Faça com que cada uma das suas classes implemente essa interface para que o método
getCarbonFootprint calcule uma pegada de carbono adequada para essa classe (confira
alguns sites que explicam como calcular pegadas de carbono).
 Bike : http://bit.ly/2r9vQjY
yearlyMiles * caloriesPerMile;
 Building : http://bit.ly/2qHfkpS
averageMonthlyKwh * months
 Car : http://bit.ly/2q9JwY1
averageYearlyMiles * averageMPG * kgCO2PerMile
4. Escreva um aplicativo que cria objetos de cada uma das três classes, insere referências a
esses objetos em ArrayList<CarbonFootprint>, então itera pelo ArrayList polimorficamente
invocando o método getCarbonFootprint de cada objeto.
5. Para cada objeto, imprima (pelo terminal) algumas informaçõoes de identificação e a pegada
de carbono do objeto.
