package presentation._01;

import org.junit.Test;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static presentation._01.PageNumber.pageNumber;
import static presentation._01.PageSize.pageSize;

public class NewsFeedPaginatorTest {

    private UserId userId = new UserId(7654);

    private NewsFeedDbAdapter dbAdapter = mock(NewsFeedDbAdapter.class);

    private NewsFeedPaginator newsFeedPaginator = new NewsFeedPaginator(dbAdapter);

    @Test
    public void test_1() {
        when(dbAdapter.getNewsFeed(userId)).thenReturn(new NewsFeed(msg(1), msg(2), msg(3)));

        NewsFeed actualNewsFeed = newsFeedPaginator.fetch(userId, pageSize(3), pageNumber(0));

        assertThat(actualNewsFeed, is(sameBeanAs(new NewsFeed(msg(1), msg(2), msg(3)))));
    }

    @Test
    public void test_2() {
        when(dbAdapter.getNewsFeed(userId)).thenReturn(new NewsFeed(msg(1), msg(2), msg(3), msg(4)));

        NewsFeed actualNewsFeed = newsFeedPaginator.fetch(userId, pageSize(2), pageNumber(0));

        assertThat(actualNewsFeed, is(sameBeanAs(new NewsFeed(msg(3), msg(4)))));
    }

    @Test
    public void test_3() {
        when(dbAdapter.getNewsFeed(userId)).thenReturn(new NewsFeed(msg(1), msg(2), msg(3), msg(4), msg(5), msg(6), msg(7)));

        NewsFeed actualNewsFeed = newsFeedPaginator.fetch(userId, pageSize(2), pageNumber(2));

        assertThat(actualNewsFeed, is(sameBeanAs(new NewsFeed(msg(2), msg(3)))));
    }

    @Test
    public void test_4() {
        when(dbAdapter.getNewsFeed(userId)).thenReturn(new NewsFeed(msg(1), msg(2), msg(3), msg(4), msg(5)));

        NewsFeed actualNewsFeed = newsFeedPaginator.fetch(userId, pageSize(3), pageNumber(1));

        assertThat(actualNewsFeed, is(sameBeanAs(new NewsFeed(msg(1), msg(2)))));
    }

    @Test
    public void test_5() {
        when(dbAdapter.getNewsFeed(userId)).thenReturn(new NewsFeed(msg(1), msg(2), msg(3)));

        NewsFeed actualNewsFeed = newsFeedPaginator.fetch(userId, pageSize(3), pageNumber(3));

        assertThat(actualNewsFeed, is(sameBeanAs(new NewsFeed())));
    }


    private static Message msg(int timestamp) {
        return new Message(timestamp, "msg-" + timestamp);
    }

}
