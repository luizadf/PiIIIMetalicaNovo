// var teste = document.getElementById('teste');

var TodosUF = document.getElementById("ListarUF");
var TodosEmpresa = document.getElementById("ListarEmpresa");
var TodosTipo = document.getElementById("ListarTipo");
var TodosAno = document.getElementById("ListarAno");
var uf = [];
var empresa = [];
var tipo = [];
var ano = [];

for (var i = 0; i < dados.length; i++) {
	uf[i] = dados[i].UF;
	empresa[i] = dados[i].GrupoEconNorm;
	tipo[i] = dados[i].Tipo;
	ano[i] = dados[i].Ano;
}

//Retira duplicidades
  uf = uf.filter(function(este, i) {
    return uf.indexOf(este) == i;
  });

  empresa = empresa.filter(function(este, i) {
    return empresa.indexOf(este) == i;
  });

 tipo = tipo.filter(function(este, i) {
 	return tipo.indexOf(este) == i;
 });

 ano = ano.filter(function(este, i) {
 	return ano.indexOf(este) == i;
 });

// var Lista = [];
for (var i = 0; i < uf.length; i++) {
	var optUF = document.createElement('option');
	optUF.value = i;
	optUF.text = uf[i];
	ListarUF.add(optUF);
}


for (var i = 0; i < empresa.length; i++) {
	var optEmpresa = document.createElement('option');
	optEmpresa.value = i;
	optEmpresa.text = empresa[i];
	ListarEmpresa.add(optEmpresa);
}

for (var i = 0; i < tipo.length; i++) {
	var optTipo = document.createElement('option');
	optTipo.value = i;
	optTipo.text = tipo[i];
	ListarTipo.add(optTipo);
}
for (var i = 0; i < ano.length; i++) {
	var optAno = document.createElement('option');
	optAno.value = i;
	optAno.text = ano[i];
	ListarAno.add(optAno);
}

function gerarGrafico(){
	
	var uf = document.getElementById("ListarUF");
	var itemSelecionadoUF = uf.options[uf.selectedIndex].text;

	var empresa = document.getElementById("ListarEmpresa");
	var itemSelecionadoEmp = empresa.options[empresa.selectedIndex].text;

  var ano = document.getElementById("ListarAno");
  var itemSelecionadoAno = ano.options[ano.selectedIndex].text;

  var tipo = document.getElementById("ListarTipo");
  var itemSelecionadoTipo = tipo.options[tipo.selectedIndex].text;


  var tituloGrafico = 'Gráfico de '+itemSelecionadoTipo+' da ' + itemSelecionadoEmp + ' no estado ' + itemSelecionadoUF + ' no ano ' + itemSelecionadoAno

	var TotalQtdOcorrencia = 0;


  var Jan =0;
  var Fev =0;
  var Mar =0;
  var Abr =0;
  var Mai =0;
  var Jun =0;
  var Jul =0;
  var Ago =0;
  var Setem =0;
  var Out =0;
  var Nov =0;
  var Dez =0;


	for (var i = 0; i < dados.length; i++) {
		if((itemSelecionadoUF == dados[i].UF) && (itemSelecionadoEmp == dados[i].GrupoEconNorm) && (itemSelecionadoAno == dados[i].Ano) && (itemSelecionadoTipo == dados[i].Tipo)){

      if(dados[i].Mes == 1){
        Jan++;
      }
      if(dados[i].Mes == 2){
        Fev++;
      }
      if(dados[i].Mes == 3){
        Mar++;
      }
      if(dados[i].Mes == 4){
        Abr++;
      }
      if(dados[i].Mes == 5){
        Mai++;
      }
      if(dados[i].Mes == 6){
        Jun++;
      }
      if(dados[i].Mes == 7){
        Jul++;
      }
      if(dados[i].Mes == 8){
        Ago++;
      }
      if(dados[i].Mes == 9){
        Setem++;
      }
      if(dados[i].Mes == 10){
        Out++;
      }
      if(dados[i].Mes == 11){
        Nov++;
      }
      if(dados[i].Mes == 12){
        Dez++;
      }


			TotalQtdOcorrencia += dados[i].QtdeSolic;
		}
	}




// Create the chart
Highcharts.chart('container', {
  chart: {
    type: 'column'
  },
  title: {
    text: tituloGrafico
  },
  subtitle: {
    text: ''
  },
  xAxis: {
    type: 'category'
  },
  yAxis: {
    title: {
      text: 'Total de Solicitações'
    }

  },
  legend: {
    enabled: false
  },
  plotOptions: {
    series: {
      borderWidth: 0,
      dataLabels: {
        enabled: true,
        format: '{point.y:.0f}'
      }
    }
  },

  tooltip: {
    headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
    pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.0f}</b> total<br/>'
  },

  "series": [
    {
      "name": "Solicitações",
      "colorByPoint": true,
      "data": [
        {
          "name": "Janeiro",
          "y": Jan,
          "drilldown": "Qualidade"
        },
        {
          "name": "Fevereiro",
          "y": Fev,
          "drilldown": "Qualidade"
        },
        {
          "name": "Março",
          "y": Mar,
          "drilldown": "Qualidade"
        },
        {
          "name": "Abril",
          "y": Abr,
          "drilldown": "Qualidade"
        },
        {
          "name": "Maio",
          "y": Mai,
          "drilldown": "Qualidade"
        },
        {
          "name": "Junho",
          "y": Jun,
          "drilldown": "Qualidade"
        },
        {
          "name": "Julho",
          "y": Jul,
          "drilldown": "Qualidade"
        },
        {
          "name": "Agosto",
          "y": Ago,
          "drilldown": "Qualidade"
        },
        {
          "name": "Setembro",
          "y": Setem,
          "drilldown": "Qualidade"
        },
        {
          "name": "Outubro",
          "y": Out,
          "drilldown": "Qualidade"
        },
        {
          "name": "Novembro",
          "y": Nov,
          "drilldown": "Qualidade"
        },
        {
          "name": "Dezembro",
          "y": Dez,
          "drilldown": "Qualidade"
        }

      ]
    }
  ]
});

}

var qtdRegistroAno = 0;

for(var i = 0; i <= dados.length; i++ ){
	if(dados[i].GrupoEconNorm == "Anatel"){
		qtdRegistroAno += 1
	}
	
}




