int ledpin = 7;
int fotopin = A1;
int soglia = 300;
 
void setup() {
  Serial.begin(9600);
  pinMode(ledpin, OUTPUT);
}

void loop() {
  int luminosita = analogRead(fotopin);
  Serial.print("Luminosità: ");
  Serial.println(luminosita);
  if(luminosita <soglia){
    digitalWrite(ledpin, HIGH);
  }else{
    digitalWrite(ledpin, LOW);
    }
  delay(250);
  }
  
  
