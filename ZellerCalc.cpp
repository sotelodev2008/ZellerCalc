#include <iostream>
#include <cstdlib>
#include <vector>
#include <string>

using namespace std;

int main(){
    static unsigned int q; static unsigned int w; static unsigned int k; static unsigned int j; static int h; unsigned int lang;
    cout << "1. English / 2. Español" << endl;
    cin >> lang;
    static vector<string> quotes;
    if (lang == 1) {
        quotes = {"Give me the numeric day: ", "Give the number of the month: ",
        "Give me the 2 last numbers of the year: ", "Give me the 2 first numbers of the year: ",
        "You have written an incorrect day number", "Some numbers you have written are wrong",
        "The result is ", ", AKA ", "Saturday", "Sunday", "Monday", "Tuesday",
        "Thursday", "Friday"};
    }
    else if (lang == 2) {
        quotes = {"Dame el dia numerico: ", "Dame el mes en numero: ",
        "Dame las 2 ultimas cifras del año: ", "Dame las 2 primeras cifras del año: ",
        "Has puesto un numero de dia incorrecto", "Alguno de los numeros que has puesto es incorrecto",
        "El resultado es ", ", que seria ", "Sabado", "Domingo", "Lunes", "Martes",
        "Jueves", "Viernes"};
    }
    else {exit(-1);}
    cout << quotes[0]; cin >> q;
    cout << endl << quotes[1]; cin >> w;
    cout << endl << quotes[2]; cin >> k;
    cout << endl << quotes[3]; cin >> j;
    if (w == 1) {w = 13; k--;}
    else if (w == 2) {w = 14; k--;}
    h = ((q + (13 * (w + 1) / 5) + k + (k / 4) + (j / 4) - (2 * j) + 700) % 7);
    if (q < 0 | q > 31) {cout << quotes[4] << endl; return -1;}
    if (h < 0 | h > 6) {cout << quotes[5] << endl; return -1;}
    cout << quotes[6] << h << quotes[7];
    if (h == 0) {cout << quotes[8] << endl;}
    else if (h == 1) {cout << quotes[9] << endl;}
    else if (h == 2) {cout << quotes[10] << endl;}
    else if (h == 3) {cout << quotes[11] << endl;}
    else if (h == 4) {cout << quotes[12] << endl;}
    else if (h == 5) {cout << quotes[13] << endl;}
    else if (h == 6) {cout << quotes[14] << endl;}
    return 0;
}