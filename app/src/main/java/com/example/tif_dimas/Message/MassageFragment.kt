package com.example.tif_dimas.Message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.tif_dimas.R
import com.example.tif_dimas.databinding.FragmentHomeBinding
import com.example.tif_dimas.databinding.FragmentMassageBinding

class MassageFragment : Fragment() {

    private var _binding: FragmentMassageBinding? = null
    private val binding get() = _binding!!

    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://avatarapi.runflare.run/public/1",  "20.30"),
        MessageModel("Budi", "Sudah makan?", "https://avatarapi.runflare.run/public/2", "20.40"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://avatarapi.runflare.run/public/3", "23.00"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://avatarapi.runflare.run/public/4", "20.50"),
        MessageModel("Eka", "Nice job kemarin!", "https://avatarapi.runflare.run/public/5", "09.30"),
        MessageModel("Fajar", "Lagi ngapain?", "https://avatarapi.runflare.run/public/6", "10.30"),
        MessageModel("Gita", "Boleh minta tolong?", "https://avatarapi.runflare.run/public/7", "08.30"),
        MessageModel("Hana", "Lihat email ya", "https://avatarapi.runflare.run/public/8", "20.20"),
        MessageModel("Irfan", "Oke noted", "https://avatarapi.runflare.run/public/9", "20.10"),
        MessageModel("Joko", "Sampai jumpa besok", "https://avatarapi.runflare.run/public/10", "20.30")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMassageBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Message"
        }
        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItems.adapter = adapter
    }
}