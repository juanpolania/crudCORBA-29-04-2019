package PersonaApp;

/**
* PersonaApp/PersonaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* mi�rcoles 24 de abril de 2019 08:36:05 PM COT
*/

public final class PersonaHolder implements org.omg.CORBA.portable.Streamable
{
  public PersonaApp.Persona value = null;

  public PersonaHolder ()
  {
  }

  public PersonaHolder (PersonaApp.Persona initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PersonaApp.PersonaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PersonaApp.PersonaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PersonaApp.PersonaHelper.type ();
  }

}
