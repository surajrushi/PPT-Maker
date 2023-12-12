import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Url(
    val type: String,
    val template: String
)

@Serializable
data class Request(
    val title: String,
    val totalResults: String,
    val searchTerms: String,
    val count: Int,
    val startIndex: Int,
    val inputEncoding: String,
    val outputEncoding: String,
    val safe: String,
    val cx: String
)

@Serializable
data class Result(
    val kind: String,
    val title: String,
    val link: String,
    val displayLink: String,
    val snippet: String,
    val htmlSnippet: String,
    val cacheId: String,
    val formattedUrl: String,
    val htmlFormattedUrl: String
)

@Serializable
data class GoogleSearchResponse(
    val kind: String,
    val url: Url,
    val queries: Queries,
    val items: List<Result>
)

@Serializable
data class Queries(
    val request: List<Request>
)
