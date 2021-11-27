package com.izza.datateman

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Damaysah Kiki Pratiwi", "Perempuan", "damaysahkiky@gmail.com",
            "081336448102", "Malang")
        )
        listTeman.add(
            MyFriend("Nur Jannah Ariyatna", "Perempuan", "annenrj01@gmail.com",
            "082245680095", "Tangerang Selatan")
        )
        listTeman.add(
            MyFriend("Arifah Putri Nurmalisa", "Perempuan", "putri.azzequi@gmail.com",
            "082229486584", "Tulungagung")
        )
        listTeman.add(MyFriend("Muhammad Mudzakir Ma'ruf", "Laki-Laki", "dif2759@gmail.com",
            "085815450549", "Tulungagung")
        )
        listTeman.add(
            MyFriend("Chinta Widiastuti", "Perempuan", "chintawidiastutik@gmail.com",
            "082232461624", "Pekanbaru")
        )
        listTeman.add(
            MyFriend("Vivi Alfina", "Perempuan", "vivialfina@gmail.com",
            "082210130495", "Nganjuk")
        )
        listTeman.add(
            MyFriend("Khisbulloh Mifta Khurosyidin", "Laki-Laki", "khisbulloh15@gmail.com",
            "087736002268", "Malang")
        )
        listTeman.add(
            MyFriend("Silvia Selawardani", "Perempuan", "sselawardani@gmail.com",
            "08976154700", "Gresik")
        )
        listTeman.add(
            MyFriend("Yafits Raudya Almalaki", "Perempuan", "yafitsraudya@gmail.com",
            "089653753025", "Malang")
        )
        listTeman.add(
            MyFriend("Nur Intan Maghfiroh", "Perempuan", "intannimghf@gmail.com",
            "08871294510", "Malang")
        )
    }

    @SuppressLint("UseRequireInsteadOfGet")
    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}