# File Size Lister 📁📊

Uma aplicação Java que lista arquivos de um diretório ordenados por tamanho em megabytes (MB).

## 📋 Descrição do Projeto

Este projeto implementa um sistema que recebe um caminho de diretório, valida sua existência e lista todos os arquivos contidos nele, ordenados por tamanho em ordem crescente (do menor para o maior).

## 🏗️ Estrutura do Projeto

```
src/
├── controller/
│   └── LSCtrl.java          # Classe de controle com lógica de ordenação
└── view/
    └── Main.java            # Classe principal com método main
```

## 🎯 Funcionalidades

### Validações Realizadas
- Verifica se o diretório existe
- Confirma que o caminho é realmente um diretório
- Lança exceção personalizada em caso de erro

### Processamento
- Lista todos os arquivos do diretório
- Ordena os arquivos por tamanho (crescente)
- Converte tamanho de bytes para megabytes
- Exibe resultados formatados em tabela

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Compilação e Execução
1. Compile o projeto:
   ```bash
   javac -d bin src/controller/*.java src/view/*.java
   ```

2. Execute a aplicação:
   ```bash
   java -cp bin view.Main
   ```

### Configuração do Diretório
Modifique a variável `dir` na classe `Main` para o caminho desejado:
```java
String dir = "C:/caminho/para/seu/diretorio";
```

## 📊 Exemplo de Saída

```
=========================================================================
      NAME                                          SIZE
=========================================================================
tangerine-noir-1x.png                    7.915496826171875E-5 MB
abandon8-1x.png                          9.34600830078125E-5 MB
cozy-adventure-1x.png                    1.2683868408203125E-4 MB
kalimba-26-1x.png                        1.6498565673828125E-4 MB
endesga-32-1x.png                        1.8787384033203125E-4 MB
desktop.ini                              2.689361572265625E-4 MB
FONTSFORMATED.png                        0.0022382736206054688 MB
trabalhoIHC.md                           0.0024127960205078125 MB
Font.png                                 0.0026445388793945312 MB
Projeto IHC - Lucas Sartorelli V0,1.odt  0.011994361877441406 MB
Cronogramas - Informática.pdf            0.042351722717285156 MB
Panfleto de dicas de sustentabilidade.pdf.pdf 0.07598400115966797 MB
DIAGRAMA HTA ANTERIOR.png                0.08818721771240234 MB
DIAGRAMA HIPERBÓLICO ATIVIDADES.png      0.12758731842041016 MB
DIAGRAMA HTA ANTERIOR (1).png            0.13067150115966797 MB
GABRIELA.docx                            0.1494159698486328 MB
ROTEIRO INTRADERMICA 2025-2.pdf          0.1505603790283203 MB
ROTEIRO SUBCUTANEA 2025-2.pdf            0.16584205627441406 MB
BACKUP IHC.docx                          0.25152587890625 MB
Roteiro de Explicação para Elaboração do Baralho da Farmacologia .pdf 0.2682962417602539 MB
ROTEIRO INTRAMUSCULARES 2025-2.pdf       0.37954139709472656 MB
ROTEIRO COLETA DE SANGUE _2025-2.pdf     0.4249715805053711 MB
ROTEIRO COLETA DE SANGUE _2025-2 (1).pdf 0.4249715805053711 MB
Documento A4 notas da reunião simples moderno azul.pdf.pdf 0.4317350387573242 MB
ROTEIRO DE PUNÇÃO VENOSA.pdf             0.5671014785766602 MB
revisão CLASSy.docx                      0.5686702728271484 MB
Sistema Unificado de Compartilhamento de Aulas.pdf 0.7511348724365234 MB
acordo pedagogico INSTRUMENTALIZAÇÃO_25.pdf 1.758784294128418 MB
imunização parte 1.pdf                   2.03017520904541 MB
Aula 6_Fármacos do Sistema Nervoso.pdf   2.540191650390625 MB
data.csv                                 8.716694831848145 MB
krita-x64-5.2.13-setup.exe               149.61917114257812 MB
Trabalho_de_SO_I.pdf                     0.17453956604003906 MB
```

## 🔧 Implementação Técnica

### Algoritmo de Ordenação
- **Método**: Bubble Sort modificado
- **Critério**: Tamanho do arquivo em bytes
- **Ordem**: Crescente (do menor para o maior)

### Conversão de Tamanho
```java
// Fórmula: bytes → kilobytes → megabytes
double sizeInMB = (f.length() / 1024.0) / 1024.0;
```

### Métodos Principais

#### `listFilesBySize(String path)`
- **Parâmetro**: Caminho do diretório
- **Validações**: Existência e tipo (diretório)
- **Processamento**: Listagem e ordenação
- **Saída**: Tabela formatada

#### `orderFilesBySize(File[] files)`
- **Algoritmo**: Bubble Sort
- **Comparação**: `File.length()` 
- **Retorno**: Array ordenado

## 🛠️ Tratamento de Erros

- `IOException` para diretórios inválidos
- Mensagens de erro descritivas
- Validação robusta de entrada

## 📝 Características da Saída

- **Formatação**: Tabela alinhada
- **Colunas**: Nome do arquivo e tamanho em MB
- **Precisão**: Tamanho com precisão decimal
- **Ordenação**: Do menor para o maior arquivo

## 💡 Casos de Uso

- Análise de uso de espaço em disco
- Identificação de arquivos grandes
- Organização de diretórios
- Limpeza de arquivos temporários

## 👨‍💻 Desenvolvido por GabrielGit10110

Projeto acadêmico para demonstração de manipulação de arquivos e algoritmos de ordenação em Java.

---

**Nota**: A aplicação lista apenas arquivos (não inclui subdiretórios) e ordena por tamanho em ordem crescente.
```
