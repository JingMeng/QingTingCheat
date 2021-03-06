package u.aly;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bf
  implements Serializable, Cloneable, bz<bf, e>
{
  public static final Map<e, cl> j;
  private static final dd k = new dd("UALogEntry");
  private static final ct l = new ct("client_stats", (byte)12, (short)1);
  private static final ct m = new ct("app_info", (byte)12, (short)2);
  private static final ct n = new ct("device_info", (byte)12, (short)3);
  private static final ct o = new ct("misc_info", (byte)12, (short)4);
  private static final ct p = new ct("activate_msg", (byte)12, (short)5);
  private static final ct q = new ct("instant_msgs", (byte)15, (short)6);
  private static final ct r = new ct("sessions", (byte)15, (short)7);
  private static final ct s = new ct("imprint", (byte)12, (short)8);
  private static final ct t = new ct("id_tracking", (byte)12, (short)9);
  private static final Map<Class<? extends dg>, dh> u = new HashMap();
  public aj a;
  public ai b;
  public ak c;
  public ax d;
  public ah e;
  public List<av> f;
  public List<bd> g;
  public at h;
  public as i;
  private e[] v;

  static
  {
    u.put(di.class, new b(null));
    u.put(dj.class, new d(null));
    EnumMap localEnumMap = new EnumMap(e.class);
    localEnumMap.put(e.a, new cl("client_stats", (byte)1, new cq((byte)12, aj.class)));
    localEnumMap.put(e.b, new cl("app_info", (byte)1, new cq((byte)12, ai.class)));
    localEnumMap.put(e.c, new cl("device_info", (byte)1, new cq((byte)12, ak.class)));
    localEnumMap.put(e.d, new cl("misc_info", (byte)1, new cq((byte)12, ax.class)));
    localEnumMap.put(e.e, new cl("activate_msg", (byte)2, new cq((byte)12, ah.class)));
    localEnumMap.put(e.f, new cl("instant_msgs", (byte)2, new cn((byte)15, new cq((byte)12, av.class))));
    localEnumMap.put(e.g, new cl("sessions", (byte)2, new cn((byte)15, new cq((byte)12, bd.class))));
    localEnumMap.put(e.h, new cl("imprint", (byte)2, new cq((byte)12, at.class)));
    localEnumMap.put(e.i, new cl("id_tracking", (byte)2, new cq((byte)12, as.class)));
    j = Collections.unmodifiableMap(localEnumMap);
    cl.a(bf.class, j);
  }

  public bf()
  {
    e[] arrayOfe = new e[5];
    arrayOfe[0] = e.e;
    arrayOfe[1] = e.f;
    arrayOfe[2] = e.g;
    arrayOfe[3] = e.h;
    arrayOfe[4] = e.i;
    this.v = arrayOfe;
  }

  public bf(aj paramaj, ai paramai, ak paramak, ax paramax)
  {
    this();
    this.a = paramaj;
    this.b = paramai;
    this.c = paramak;
    this.d = paramax;
  }

  public bf(bf parambf)
  {
    e[] arrayOfe = new e[5];
    arrayOfe[0] = e.e;
    arrayOfe[1] = e.f;
    arrayOfe[2] = e.g;
    arrayOfe[3] = e.h;
    arrayOfe[4] = e.i;
    this.v = arrayOfe;
    if (parambf.e())
      this.a = new aj(parambf.a);
    if (parambf.i())
      this.b = new ai(parambf.b);
    if (parambf.l())
      this.c = new ak(parambf.c);
    if (parambf.o())
      this.d = new ax(parambf.d);
    if (parambf.r())
      this.e = new ah(parambf.e);
    if (parambf.w())
    {
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator1 = parambf.f.iterator();
      while (localIterator1.hasNext())
        localArrayList1.add(new av((av)localIterator1.next()));
      this.f = localArrayList1;
    }
    if (parambf.B())
    {
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator2 = parambf.g.iterator();
      while (localIterator2.hasNext())
        localArrayList2.add(new bd((bd)localIterator2.next()));
      this.g = localArrayList2;
    }
    if (parambf.E())
      this.h = new at(parambf.h);
    if (parambf.H())
      this.i = new as(parambf.i);
  }

  private void a(ObjectInputStream paramObjectInputStream)
    throws IOException, ClassNotFoundException
  {
    try
    {
      a(new cs(new dk(paramObjectInputStream)));
      return;
    }
    catch (cf localcf)
    {
      throw new IOException(localcf.getMessage());
    }
  }

  private void a(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    try
    {
      b(new cs(new dk(paramObjectOutputStream)));
      return;
    }
    catch (cf localcf)
    {
      throw new IOException(localcf.getMessage());
    }
  }

  public void A()
  {
    this.g = null;
  }

  public boolean B()
  {
    return this.g != null;
  }

  public at C()
  {
    return this.h;
  }

  public void D()
  {
    this.h = null;
  }

  public boolean E()
  {
    return this.h != null;
  }

  public as F()
  {
    return this.i;
  }

  public void G()
  {
    this.i = null;
  }

  public boolean H()
  {
    return this.i != null;
  }

  public void I()
    throws cf
  {
    if (this.a == null)
      throw new cz("Required field 'client_stats' was not present! Struct: " + toString());
    if (this.b == null)
      throw new cz("Required field 'app_info' was not present! Struct: " + toString());
    if (this.c == null)
      throw new cz("Required field 'device_info' was not present! Struct: " + toString());
    if (this.d == null)
      throw new cz("Required field 'misc_info' was not present! Struct: " + toString());
    if (this.a != null)
      this.a.m();
    if (this.b != null)
      this.b.H();
    if (this.c != null)
      this.c.ac();
    if (this.d != null)
      this.d.K();
    if (this.e != null)
      this.e.f();
    if (this.h != null)
      this.h.n();
    if (this.i != null)
      this.i.p();
  }

  public e a(int paramInt)
  {
    return e.a(paramInt);
  }

  public bf a()
  {
    return new bf(this);
  }

  public bf a(List<av> paramList)
  {
    this.f = paramList;
    return this;
  }

  public bf a(ah paramah)
  {
    this.e = paramah;
    return this;
  }

  public bf a(ai paramai)
  {
    this.b = paramai;
    return this;
  }

  public bf a(aj paramaj)
  {
    this.a = paramaj;
    return this;
  }

  public bf a(ak paramak)
  {
    this.c = paramak;
    return this;
  }

  public bf a(as paramas)
  {
    this.i = paramas;
    return this;
  }

  public bf a(at paramat)
  {
    this.h = paramat;
    return this;
  }

  public bf a(ax paramax)
  {
    this.d = paramax;
    return this;
  }

  public void a(av paramav)
  {
    if (this.f == null)
      this.f = new ArrayList();
    this.f.add(paramav);
  }

  public void a(bd parambd)
  {
    if (this.g == null)
      this.g = new ArrayList();
    this.g.add(parambd);
  }

  public void a(cy paramcy)
    throws cf
  {
    ((dh)u.get(paramcy.D())).b().b(paramcy, this);
  }

  public void a(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.a = null;
  }

  public bf b(List<bd> paramList)
  {
    this.g = paramList;
    return this;
  }

  public void b()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
  }

  public void b(cy paramcy)
    throws cf
  {
    ((dh)u.get(paramcy.D())).b().a(paramcy, this);
  }

  public void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.b = null;
  }

  public aj c()
  {
    return this.a;
  }

  public void c(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.c = null;
  }

  public void d()
  {
    this.a = null;
  }

  public void d(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.d = null;
  }

  public void e(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.e = null;
  }

  public boolean e()
  {
    return this.a != null;
  }

  public ai f()
  {
    return this.b;
  }

  public void f(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.f = null;
  }

  public void g(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.g = null;
  }

  public void h()
  {
    this.b = null;
  }

  public void h(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.h = null;
  }

  public void i(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.i = null;
  }

  public boolean i()
  {
    return this.b != null;
  }

  public ak j()
  {
    return this.c;
  }

  public void k()
  {
    this.c = null;
  }

  public boolean l()
  {
    return this.c != null;
  }

  public ax m()
  {
    return this.d;
  }

  public void n()
  {
    this.d = null;
  }

  public boolean o()
  {
    return this.d != null;
  }

  public ah p()
  {
    return this.e;
  }

  public void q()
  {
    this.e = null;
  }

  public boolean r()
  {
    return this.e != null;
  }

  public int s()
  {
    if (this.f == null)
      return 0;
    return this.f.size();
  }

  public Iterator<av> t()
  {
    if (this.f == null)
      return null;
    return this.f.iterator();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("UALogEntry(");
    localStringBuilder.append("client_stats:");
    if (this.a == null)
    {
      localStringBuilder.append("null");
      localStringBuilder.append(", ");
      localStringBuilder.append("app_info:");
      if (this.b != null)
        break label342;
      localStringBuilder.append("null");
      label65: localStringBuilder.append(", ");
      localStringBuilder.append("device_info:");
      if (this.c != null)
        break label354;
      localStringBuilder.append("null");
      label96: localStringBuilder.append(", ");
      localStringBuilder.append("misc_info:");
      if (this.d != null)
        break label366;
      localStringBuilder.append("null");
      label127: if (r())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append("activate_msg:");
        if (this.e != null)
          break label378;
        localStringBuilder.append("null");
      }
      label165: if (w())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append("instant_msgs:");
        if (this.f != null)
          break label390;
        localStringBuilder.append("null");
      }
      label203: if (B())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append("sessions:");
        if (this.g != null)
          break label402;
        localStringBuilder.append("null");
      }
      label241: if (E())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append("imprint:");
        if (this.h != null)
          break label414;
        localStringBuilder.append("null");
      }
      label279: if (H())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append("id_tracking:");
        if (this.i != null)
          break label426;
        localStringBuilder.append("null");
      }
    }
    while (true)
    {
      localStringBuilder.append(")");
      return localStringBuilder.toString();
      localStringBuilder.append(this.a);
      break;
      label342: localStringBuilder.append(this.b);
      break label65;
      label354: localStringBuilder.append(this.c);
      break label96;
      label366: localStringBuilder.append(this.d);
      break label127;
      label378: localStringBuilder.append(this.e);
      break label165;
      label390: localStringBuilder.append(this.f);
      break label203;
      label402: localStringBuilder.append(this.g);
      break label241;
      label414: localStringBuilder.append(this.h);
      break label279;
      label426: localStringBuilder.append(this.i);
    }
  }

  public List<av> u()
  {
    return this.f;
  }

  public void v()
  {
    this.f = null;
  }

  public boolean w()
  {
    return this.f != null;
  }

  public int x()
  {
    if (this.g == null)
      return 0;
    return this.g.size();
  }

  public Iterator<bd> y()
  {
    if (this.g == null)
      return null;
    return this.g.iterator();
  }

  public List<bd> z()
  {
    return this.g;
  }

  private static class a extends di<bf>
  {
    public void a(cy paramcy, bf parambf)
      throws cf
    {
      paramcy.j();
      ct localct = paramcy.l();
      if (localct.b == 0)
      {
        paramcy.k();
        parambf.I();
        return;
      }
      switch (localct.c)
      {
      default:
        db.a(paramcy, localct.b);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      while (true)
      {
        paramcy.m();
        break;
        if (localct.b == 12)
        {
          parambf.a = new aj();
          parambf.a.a(paramcy);
          parambf.a(true);
        }
        else
        {
          db.a(paramcy, localct.b);
          continue;
          if (localct.b == 12)
          {
            parambf.b = new ai();
            parambf.b.a(paramcy);
            parambf.b(true);
          }
          else
          {
            db.a(paramcy, localct.b);
            continue;
            if (localct.b == 12)
            {
              parambf.c = new ak();
              parambf.c.a(paramcy);
              parambf.c(true);
            }
            else
            {
              db.a(paramcy, localct.b);
              continue;
              if (localct.b == 12)
              {
                parambf.d = new ax();
                parambf.d.a(paramcy);
                parambf.d(true);
              }
              else
              {
                db.a(paramcy, localct.b);
                continue;
                if (localct.b == 12)
                {
                  parambf.e = new ah();
                  parambf.e.a(paramcy);
                  parambf.e(true);
                }
                else
                {
                  db.a(paramcy, localct.b);
                  continue;
                  if (localct.b == 15)
                  {
                    cu localcu2 = paramcy.p();
                    parambf.f = new ArrayList(localcu2.b);
                    for (int j = 0; j < localcu2.b; j++)
                    {
                      av localav = new av();
                      localav.a(paramcy);
                      parambf.f.add(localav);
                    }
                    paramcy.q();
                    parambf.f(true);
                  }
                  else
                  {
                    db.a(paramcy, localct.b);
                    continue;
                    if (localct.b == 15)
                    {
                      cu localcu1 = paramcy.p();
                      parambf.g = new ArrayList(localcu1.b);
                      for (int i = 0; i < localcu1.b; i++)
                      {
                        bd localbd = new bd();
                        localbd.a(paramcy);
                        parambf.g.add(localbd);
                      }
                      paramcy.q();
                      parambf.g(true);
                    }
                    else
                    {
                      db.a(paramcy, localct.b);
                      continue;
                      if (localct.b == 12)
                      {
                        parambf.h = new at();
                        parambf.h.a(paramcy);
                        parambf.h(true);
                      }
                      else
                      {
                        db.a(paramcy, localct.b);
                        continue;
                        if (localct.b == 12)
                        {
                          parambf.i = new as();
                          parambf.i.a(paramcy);
                          parambf.i(true);
                        }
                        else
                        {
                          db.a(paramcy, localct.b);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    public void b(cy paramcy, bf parambf)
      throws cf
    {
      parambf.I();
      paramcy.a(bf.J());
      if (parambf.a != null)
      {
        paramcy.a(bf.K());
        parambf.a.b(paramcy);
        paramcy.c();
      }
      if (parambf.b != null)
      {
        paramcy.a(bf.L());
        parambf.b.b(paramcy);
        paramcy.c();
      }
      if (parambf.c != null)
      {
        paramcy.a(bf.M());
        parambf.c.b(paramcy);
        paramcy.c();
      }
      if (parambf.d != null)
      {
        paramcy.a(bf.N());
        parambf.d.b(paramcy);
        paramcy.c();
      }
      if ((parambf.e != null) && (parambf.r()))
      {
        paramcy.a(bf.O());
        parambf.e.b(paramcy);
        paramcy.c();
      }
      if ((parambf.f != null) && (parambf.w()))
      {
        paramcy.a(bf.P());
        paramcy.a(new cu((byte)12, parambf.f.size()));
        Iterator localIterator2 = parambf.f.iterator();
        while (localIterator2.hasNext())
          ((av)localIterator2.next()).b(paramcy);
        paramcy.f();
        paramcy.c();
      }
      if ((parambf.g != null) && (parambf.B()))
      {
        paramcy.a(bf.Q());
        paramcy.a(new cu((byte)12, parambf.g.size()));
        Iterator localIterator1 = parambf.g.iterator();
        while (localIterator1.hasNext())
          ((bd)localIterator1.next()).b(paramcy);
        paramcy.f();
        paramcy.c();
      }
      if ((parambf.h != null) && (parambf.E()))
      {
        paramcy.a(bf.R());
        parambf.h.b(paramcy);
        paramcy.c();
      }
      if ((parambf.i != null) && (parambf.H()))
      {
        paramcy.a(bf.S());
        parambf.i.b(paramcy);
        paramcy.c();
      }
      paramcy.d();
      paramcy.b();
    }
  }

  private static class b
    implements dh
  {
    public bf.a a()
    {
      return new bf.a(null);
    }
  }

  private static class c extends dj<bf>
  {
    public void a(cy paramcy, bf parambf)
      throws cf
    {
      de localde = (de)paramcy;
      parambf.a.b(localde);
      parambf.b.b(localde);
      parambf.c.b(localde);
      parambf.d.b(localde);
      BitSet localBitSet = new BitSet();
      if (parambf.r())
        localBitSet.set(0);
      if (parambf.w())
        localBitSet.set(1);
      if (parambf.B())
        localBitSet.set(2);
      if (parambf.E())
        localBitSet.set(3);
      if (parambf.H())
        localBitSet.set(4);
      localde.a(localBitSet, 5);
      if (parambf.r())
        parambf.e.b(localde);
      if (parambf.w())
      {
        localde.a(parambf.f.size());
        Iterator localIterator2 = parambf.f.iterator();
        while (localIterator2.hasNext())
          ((av)localIterator2.next()).b(localde);
      }
      if (parambf.B())
      {
        localde.a(parambf.g.size());
        Iterator localIterator1 = parambf.g.iterator();
        while (localIterator1.hasNext())
          ((bd)localIterator1.next()).b(localde);
      }
      if (parambf.E())
        parambf.h.b(localde);
      if (parambf.H())
        parambf.i.b(localde);
    }

    public void b(cy paramcy, bf parambf)
      throws cf
    {
      int i = 0;
      de localde = (de)paramcy;
      parambf.a = new aj();
      parambf.a.a(localde);
      parambf.a(true);
      parambf.b = new ai();
      parambf.b.a(localde);
      parambf.b(true);
      parambf.c = new ak();
      parambf.c.a(localde);
      parambf.c(true);
      parambf.d = new ax();
      parambf.d.a(localde);
      parambf.d(true);
      BitSet localBitSet = localde.b(5);
      if (localBitSet.get(0))
      {
        parambf.e = new ah();
        parambf.e.a(localde);
        parambf.e(true);
      }
      if (localBitSet.get(1))
      {
        cu localcu1 = new cu((byte)12, localde.w());
        parambf.f = new ArrayList(localcu1.b);
        for (int j = 0; j < localcu1.b; j++)
        {
          av localav = new av();
          localav.a(localde);
          parambf.f.add(localav);
        }
        parambf.f(true);
      }
      if (localBitSet.get(2))
      {
        cu localcu2 = new cu((byte)12, localde.w());
        parambf.g = new ArrayList(localcu2.b);
        while (i < localcu2.b)
        {
          bd localbd = new bd();
          localbd.a(localde);
          parambf.g.add(localbd);
          i++;
        }
        parambf.g(true);
      }
      if (localBitSet.get(3))
      {
        parambf.h = new at();
        parambf.h.a(localde);
        parambf.h(true);
      }
      if (localBitSet.get(4))
      {
        parambf.i = new as();
        parambf.i.a(localde);
        parambf.i(true);
      }
    }
  }

  private static class d
    implements dh
  {
    public bf.c a()
    {
      return new bf.c(null);
    }
  }

  public static enum e
    implements cg
  {
    private static final Map<String, e> j;
    private final short k;
    private final String l;

    static
    {
      e[] arrayOfe = new e[9];
      arrayOfe[0] = a;
      arrayOfe[1] = b;
      arrayOfe[2] = c;
      arrayOfe[3] = d;
      arrayOfe[4] = e;
      arrayOfe[5] = f;
      arrayOfe[6] = g;
      arrayOfe[7] = h;
      arrayOfe[8] = i;
      m = arrayOfe;
      j = new HashMap();
      Iterator localIterator = EnumSet.allOf(e.class).iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        j.put(locale.b(), locale);
      }
    }

    private e(short paramShort, String paramString)
    {
      this.k = paramShort;
      this.l = paramString;
    }

    public static e a(int paramInt)
    {
      switch (paramInt)
      {
      default:
        return null;
      case 1:
        return a;
      case 2:
        return b;
      case 3:
        return c;
      case 4:
        return d;
      case 5:
        return e;
      case 6:
        return f;
      case 7:
        return g;
      case 8:
        return h;
      case 9:
      }
      return i;
    }

    public static e a(String paramString)
    {
      return (e)j.get(paramString);
    }

    public static e b(int paramInt)
    {
      e locale = a(paramInt);
      if (locale == null)
        throw new IllegalArgumentException("Field " + paramInt + " doesn't exist!");
      return locale;
    }

    public short a()
    {
      return this.k;
    }

    public String b()
    {
      return this.l;
    }
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     u.aly.bf
 * JD-Core Version:    0.6.2
 */