package Vererbung;

public class Einwohner {
    String name;

    public Einwohner() {
        this.name = "John";
    }

    public Einwohner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGruss(String language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " sagt: ");
        switch (language) {
            case "de":
                stringBuilder.append("Guten Tag, mein Name ist " + name + ". Ich komme aus Deutschland.");
                break;
            case "us":
                stringBuilder.append("Hello, my name is " + name + ", I’m from the United States.");
                break;
            case "fr":
                stringBuilder.append("Bonjour, je m’appelle " + name + ". Je viens de France.");
                break;
            case "en":
                stringBuilder.append("Hello, my name is " + name + ". I come from the UK.");
                break;
            case "it":
                stringBuilder.append("Buon giorno, mi chiamo " + name + " e vengo dall‘Italia.");
                break;
        }
        return stringBuilder.toString();
    }


    public String getChef(String language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Das Staatsoberhaupt von " + name + ": ");
        switch (language) {
            case "de":
                stringBuilder.append("Frank-Walter Steinmeier.");
                break;
            case "us":
                stringBuilder.append("Donald Trump.");
                break;
            case "fr":
                stringBuilder.append("Emmanuel Macron.");
                break;
            case "en":
                stringBuilder.append("King Charles");
                break;
            case "it":
                stringBuilder.append("Sergio Mattarella");
                break;
        }
        return stringBuilder.toString();
    }


}
