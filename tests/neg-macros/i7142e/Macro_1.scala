package macros
import scala.quoted._

def oops(using QuoteContext) = {
  var v = '{0};
  val q = '{ def x: Int = 8; ${ v = '{x}; v } }
  v
}
inline def test = ${oops}
