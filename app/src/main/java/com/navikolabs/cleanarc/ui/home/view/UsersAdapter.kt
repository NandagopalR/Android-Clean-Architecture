package com.navikolabs.cleanarc.ui.home.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.navikolabs.cleanarc.R
import com.navikolabs.cleanarc.domain.model.User

class UsersAdapter(private val context: Context) :
    RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {

    private val users = mutableListOf<User>()

    fun setUserList(userList: List<User>) {
        users.clear()
        users.addAll(userList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.bindDataToView(user)
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @BindView(R.id.tv_name)
        lateinit var tvName: TextView

        @BindView(R.id.tv_mobile)
        lateinit var tvMobile: TextView

        @BindView(R.id.tv_mail)
        lateinit var tvMail: TextView

        init {
            ButterKnife.bind(this, itemView)
        }

        fun bindDataToView(user: User) {
            tvName.text = user.name
            tvMobile.text = user.phone
            tvMail.text = user.email
        }

    }

}