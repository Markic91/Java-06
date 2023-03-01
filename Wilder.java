class Wilder {

  //attributes
  private String firstname;
  private boolean aware;

  //constructor
  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  //getters
  public String getFirstname() {
    return this.firstname;
  }
  public boolean getAware() {
    return this.aware;
  }

  //setters
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public void setAware(boolean aware) {
    this.aware = aware;
  }

  //Instance method
  public String whoAmI() {
  //   if(this.aware) {
  //      return "Je m'appelle " + this.getFirstname() + " et je suis aware";
  //   }
  //   else {
  //     return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
  //   }
  // }
  return this.aware ? "Je m'appelle " + this.getFirstname() + "et je suis aware" : "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
}
}