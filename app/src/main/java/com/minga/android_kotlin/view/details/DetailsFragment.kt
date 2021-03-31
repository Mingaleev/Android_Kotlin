package com.minga.android_kotlin.view.details

import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsFragment()
    }
//
//    private var _binding: FragmentDetailsBinding? = null
//
//    private val binding get() = _binding!!
//
//    private lateinit var viewModel: MainViewModel
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//
//        viewModel
//            .getLiveData()
//            .observe(
//                viewLifecycleOwner,
//                Observer { renderData(it) }
//            )
//
//        viewModel.getWeatherFromLocalSource()
//    }
//
//    private fun renderData(appState: AppState) = when (appState) {
//        is AppState.Success -> {
//            val weatherData = appState.weatherData
//            binding.loadingLayout.visibility = View.GONE
//            setData(weatherData)
//        }
//
//        is AppState.Loading -> {
//            binding.loadingLayout.visibility = View.VISIBLE
//        }
//
//        is AppState.Error -> {
//            binding.loadingLayout.visibility = View.GONE
//            Snackbar.make(binding.main, "Ошибка", Snackbar.LENGTH_INDEFINITE)
//                .setAction("Повторить") { viewModel.getWeatherFromLocalSource() }
//                .show()
//        }
//    }
//
//    private fun setData(weatherData: Weather) {
//        binding.tvCity.text = weatherData.city.cityName
//        binding.tvCondition.text = weatherData.condition
//        binding.tvTemperatureNow.text = weatherData.temperature.toString()
//        binding.tvFeelsLike.text = weatherData.feels_like.toString()
//    }
}