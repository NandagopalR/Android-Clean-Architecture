package com.navikolabs.cleanarc.ui.home.view

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.navikolabs.cleanarc.R
import com.navikolabs.cleanarc.di.factory.bindViewModel
import com.navikolabs.cleanarc.domain.model.User
import com.navikolabs.cleanarc.ui.base.BaseActivity
import com.navikolabs.cleanarc.ui.base.ResponseStatus
import com.navikolabs.cleanarc.ui.home.presentation.HomeViewModel
import com.navikolabs.cleanarc.utils.UiUtils

class HomeActivity : BaseActivity() {

    @BindView(R.id.rv_users)
    lateinit var rvUsers: RecyclerView

    @BindView(R.id.progressBar)
    lateinit var progressBar: ProgressBar

    @BindView(R.id.tv_no_data)
    lateinit var tvNoData: TextView

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var adapter: UsersAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        bindViewModel()
        fetchUsersData()
        adapter = UsersAdapter(this)
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = adapter
        homeViewModel.fetchUsers()
    }

    private fun bindViewModel() {
        homeViewModel = viewModelFactory.bindViewModel(this)
    }

    private fun fetchUsersData() {
        homeViewModel.viewState.observe(this, Observer { viewState ->
            progressBar.visibility = View.GONE
            when (viewState.status) {
                ResponseStatus.SUCCESS -> {
                    val users = viewState.data as List<User>
                    if (!users.isNullOrEmpty()) {
                        tvNoData.visibility = View.GONE
                        rvUsers.visibility = View.VISIBLE
                        adapter.setUserList(users)
                    } else {
                        tvNoData.visibility = View.VISIBLE
                        rvUsers.visibility = View.GONE
                    }
                }
                ResponseStatus.ERROR -> {
                    val throwable = viewState.throwable
                    val errorMsg = throwable?.message
                    UiUtils.showToast(
                        this,
                        if (!errorMsg.isNullOrBlank()) errorMsg else "Something went wrong..."
                    )
                }
            }
        })
    }
}