package PersonaApp;


/**
* PersonaApp/_PersonaStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* mi�rcoles 24 de abril de 2019 08:36:05 PM COT
*/

public class _PersonaStub extends org.omg.CORBA.portable.ObjectImpl implements PersonaApp.Persona
{

  public boolean insertarPersona (int identificacion, String nombre, String apellido, String direccion, String telefono, String email)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarPersona", true);
                $out.write_long (identificacion);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (direccion);
                $out.write_wstring (telefono);
                $out.write_wstring (email);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarPersona (identificacion, nombre, apellido, direccion, telefono, email        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarPersona

  public String consultarPersona (int identificacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarPersona", true);
                $out.write_long (identificacion);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarPersona (identificacion        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarPersona

  public boolean actualizarPersona (int identificacion, String nombre, String apellido, String direccion, String telefono, String email)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarPersona", true);
                $out.write_long (identificacion);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (direccion);
                $out.write_wstring (telefono);
                $out.write_wstring (email);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarPersona (identificacion, nombre, apellido, direccion, telefono, email        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarPersona

  public boolean eliminarPersona (int identificacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarPersona", true);
                $out.write_long (identificacion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarPersona (identificacion        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarPersona

  public String listarPersonas ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarPersonas", true);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarPersonas (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarPersonas

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PersonaApp/Persona:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PersonaStub
