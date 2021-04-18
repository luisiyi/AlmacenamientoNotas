package gutierrezmorquecho.luis.mis_notas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.nota_layout.view.*
import java.util.ArrayList


class AdaptadorNotas: BaseAdapter {
    var notas = ArrayList<Nota>()
    var context: Context? = null

    constructor(context: Context?, notas: ArrayList<Nota>) : super() {
        this.notas = notas
        this.context = context
    }


    override fun getCount(): Int {
        return notas.size
    }

    override fun getItem(position: Int): Any {
        return notas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var nota = notas[p0]
        var inflator = LayoutInflater.from(context)
        var vista = inflator.inflate(R.layout.nota_layout, null)
        vista.tv_titulo_det.text = nota.titulo
        vista.tv_contenido_det.text = nota.contenido

        return vista
    }
}