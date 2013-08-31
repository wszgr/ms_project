                                                                                                    import java.util.*;                                                                                                    
                                                                                                    import soot.*;                                                                                                    
                                                                                                    import soot.jimple.*;                                                                                                    
                                                                                                    import soot.util.*;                                                                                                    
                                                                                                                                                                                                        
                                                                                                    public class                                                                                                     org_apache_tomcat_dbcp_dbcp_cpdsadapter_PoolablePreparedStatementStub_Maker                                                                                                     {                                                                                                    
                                                                                                    private static Local localByName(Body b, String name) {                                                                                                    
                                                                                                    	for(Local l: b.getLocals()) {                                                                                                    
                                                                                                    		if(l.getName().equals(name))                                                                                                    
                                                                                                    			return l;                                                                                                    
                                                                                                    	}                                                                                                    
                                                                                                    	throw new IllegalArgumentException("No such local: "+name);                                                                                                    
                                                                                                    }                                                                                                    
                                                                                                      public void create() {                                                                                                      
                                                                                                        SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub");                                                                                                        
                                                                                                        c.setApplicationClass();                                                                                                        
                                                                                                        Scene.v().addClass(c);                                                                                                        
                                                                                                        createMethod0(c);                                                                                                        
                                                                                                        createMethod1(c);                                                                                                        
                                                                                                        createMethod2(c);                                                                                                        
                                                                                                      }                                                                                                      
                                                                                                                                                                                                        
                                                                                                      public void createMethod0(SootClass c) {                                                                                                      
                                                                                                        SootMethod m = new SootMethod("<init>",null,null);                                                                                                        
                                                                                                        Body b = Jimple.v().newBody(m);                                                                                                        
                                                                                                        m.setActiveBody(b);                                                                                                        
                                                                                                        Chain<Local> locals = b.getLocals();                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub")));                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r1", RefType.v("java.sql.PreparedStatement")));                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.Object")));                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r3", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r4", RefType.v("java.sql.Connection")));                                                                                                        
                                                                                                        Chain<Unit> units = b.getUnits();                                                                                                        
                                                                                                        Local lhs0 = localByName(b,"r0");                                                                                                        
                                                                                                        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub");                                                                                                        
                                                                                                        Value idRef0 = Jimple.v().newThisRef(type0);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                                                        
                                                                                                        Local lhs1 = localByName(b,"r1");                                                                                                        
                                                                                                        RefType paramType0 = RefType.v("java.sql.PreparedStatement");                                                                                                        
                                                                                                        int number0=0;                                                                                                        
                                                                                                        Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                                                        
                                                                                                        Local lhs2 = localByName(b,"r2");                                                                                                        
                                                                                                        RefType paramType1 = RefType.v("java.lang.Object");                                                                                                        
                                                                                                        int number1=1;                                                                                                        
                                                                                                        Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));                                                                                                        
                                                                                                        Local lhs3 = localByName(b,"r3");                                                                                                        
                                                                                                        RefType paramType2 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");                                                                                                        
                                                                                                        int number2=2;                                                                                                        
                                                                                                        Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));                                                                                                        
                                                                                                        Local lhs4 = localByName(b,"r4");                                                                                                        
                                                                                                        RefType paramType3 = RefType.v("java.sql.Connection");                                                                                                        
                                                                                                        int number3=3;                                                                                                        
                                                                                                        Value idRef4 = Jimple.v().newParameterRef(paramType3, number3);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs4,idRef4));                                                                                                        
                                                                                                        {                                                                                                        
                                                                                                          Local base = localByName(b,"r0");                                                                                                          
                                                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                                                          
                                                                                                          RefType type0 = RefType.v("java.sql.PreparedStatement");                                                                                                          
                                                                                                          parameterTypes.add(type0);                                                                                                          
                                                                                                          RefType type1 = RefType.v("java.lang.Object");                                                                                                          
                                                                                                          parameterTypes.add(type1);                                                                                                          
                                                                                                          RefType type2 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");                                                                                                          
                                                                                                          parameterTypes.add(type2);                                                                                                          
                                                                                                          RefType type3 = RefType.v("java.sql.Connection");                                                                                                          
                                                                                                          parameterTypes.add(type3);                                                                                                          
                                                                                                          Type returnType = VoidType.v();                                                                                                          
                                                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.PoolablePreparedStatement"),"<init>",parameterTypes,returnType,false);                                                                                                          
                                                                                                          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                                                          
                                                                                                        }                                                                                                        
                                                                                                        units.add(Jimple.v().newInvokeStmt(ie0));                                                                                                        
                                                                                                        units.add(Jimple.v().newReturnVoidStmt());                                                                                                        
                                                                                                      }                                                                                                      
                                                                                                                                                                                                        
                                                                                                      public void createMethod1(SootClass c) {                                                                                                      
                                                                                                        SootMethod m = new SootMethod("activate",null,null);                                                                                                        
                                                                                                        Body b = Jimple.v().newBody(m);                                                                                                        
                                                                                                        m.setActiveBody(b);                                                                                                        
                                                                                                        Chain<Local> locals = b.getLocals();                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub")));                                                                                                        
                                                                                                        Chain<Unit> units = b.getUnits();                                                                                                        
                                                                                                        Local lhs0 = localByName(b,"r0");                                                                                                        
                                                                                                        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub");                                                                                                        
                                                                                                        Value idRef0 = Jimple.v().newThisRef(type0);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                                                        
                                                                                                        {                                                                                                        
                                                                                                          Local base = localByName(b,"r0");                                                                                                          
                                                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                                                          
                                                                                                          Type returnType = VoidType.v();                                                                                                          
                                                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.PoolablePreparedStatement"),"activate",parameterTypes,returnType,false);                                                                                                          
                                                                                                          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                                                          
                                                                                                        }                                                                                                        
                                                                                                        units.add(Jimple.v().newInvokeStmt(ie0));                                                                                                        
                                                                                                        units.add(Jimple.v().newReturnVoidStmt());                                                                                                        
                                                                                                      }                                                                                                      
                                                                                                                                                                                                        
                                                                                                      public void createMethod2(SootClass c) {                                                                                                      
                                                                                                        SootMethod m = new SootMethod("passivate",null,null);                                                                                                        
                                                                                                        Body b = Jimple.v().newBody(m);                                                                                                        
                                                                                                        m.setActiveBody(b);                                                                                                        
                                                                                                        Chain<Local> locals = b.getLocals();                                                                                                        
                                                                                                        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub")));                                                                                                        
                                                                                                        Chain<Unit> units = b.getUnits();                                                                                                        
                                                                                                        Local lhs0 = localByName(b,"r0");                                                                                                        
                                                                                                        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PoolablePreparedStatementStub");                                                                                                        
                                                                                                        Value idRef0 = Jimple.v().newThisRef(type0);                                                                                                        
                                                                                                        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                                                        
                                                                                                        {                                                                                                        
                                                                                                          Local base = localByName(b,"r0");                                                                                                          
                                                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                                                          
                                                                                                          Type returnType = VoidType.v();                                                                                                          
                                                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.PoolablePreparedStatement"),"passivate",parameterTypes,returnType,false);                                                                                                          
                                                                                                          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                                                          
                                                                                                        }                                                                                                        
                                                                                                        units.add(Jimple.v().newInvokeStmt(ie0));                                                                                                        
                                                                                                        units.add(Jimple.v().newReturnVoidStmt());                                                                                                        
                                                                                                      }                                                                                                      
                                                                                                                                                                                                        
                                                                                                    }                                                                                                    
