Tech Stack:
Kotlin with Jetpack Compose for modern, declarative UI.

Retrofit for API calls to the CoinGecko API (or a similar source).

Coroutines + ViewModel for async data handling and UI state.

Hilt or Koin (optional) for dependency injection.

Coil for loading coin logos.

💡 Features Implemented:
✅ 1. Real-Time Crypto Price Listing
A scrollable list (likely using LazyColumn) that shows top coins with:

Name, symbol, current price

24-hour price change (with color indication)

Coin image/logo

✅ 2. Search Functionality
Integrated TextField or SearchBar to filter coins by name or symbol in real-time.

✅ 3. Navigation
Used NavHost and NavController for navigating between:

Home screen (coin list)

Coin detail screen (price, market cap, charts, etc.)

✅ 4. Coin Details Screen
Detailed view with extra info like:

Price charts (possibly using AndroidPlot or custom canvas)

Market Cap, Supply, 7-day trend

✅ 5. UI/UX with Compose
Beautiful, animated Compose UI with:

Light/dark mode

Material You theming

Responsive layouts with Modifier chains
