package fm.qingting.qtradio.view.playview;

import android.content.Context;
import android.view.View.MeasureSpec;
import fm.qingting.framework.view.ViewGroupViewImpl;
import fm.qingting.framework.view.ViewLayout;
import fm.qingting.qtradio.model.ChannelNode;
import fm.qingting.qtradio.model.InfoManager;
import fm.qingting.qtradio.model.InfoManager.DataExceptionStatus;
import fm.qingting.qtradio.model.InfoManager.ISubscribeEventListener;
import fm.qingting.qtradio.model.RootNode;
import fm.qingting.qtradio.view.LoadMoreListView.onLoadMoreListener;
import java.util.HashSet;
import java.util.List;

public class PlayListView extends ViewGroupViewImpl
  implements InfoManager.ISubscribeEventListener
{
  private final ViewLayout headLayout = this.standardLayout.createChildLT(720, 98, 0, 0, ViewLayout.SCALE_FLAG_SLTCW);
  private ScheduleHeadView mHeadView;
  private VirtualPlaylistView mListView;
  private HashSet<Integer> mLoadedPosition = new HashSet();
  private int mLoadedTotal = 0;
  private final ViewLayout standardLayout = ViewLayout.createViewLayoutWithBoundsLT(720, 1200, 720, 1200, 0, 0, ViewLayout.FILL);

  public PlayListView(Context paramContext)
  {
    super(paramContext);
    this.mHeadView = new ScheduleHeadView(paramContext);
    addView(this.mHeadView);
    this.mListView = new VirtualPlaylistView(paramContext);
    this.mListView.setOnLoadMoreListener(new LoadMoreListView.onLoadMoreListener()
    {
      public void onLoadMore(int paramAnonymousInt)
      {
        PlayListView.this.loadMore(paramAnonymousInt);
      }
    });
    addView(this.mListView);
  }

  private void loadMore(int paramInt)
  {
    if (this.mLoadedPosition.contains(Integer.valueOf(paramInt)))
      return;
    this.mLoadedTotal = paramInt;
    this.mLoadedPosition.add(Integer.valueOf(paramInt));
    InfoManager.getInstance().loadProgramsScheduleNode(InfoManager.getInstance().root().getCurrentPlayingChannelNode(), this);
  }

  private void setProgramList()
  {
    ChannelNode localChannelNode = InfoManager.getInstance().root().getCurrentPlayingChannelNode();
    if (localChannelNode != null)
    {
      List localList = localChannelNode.getAllLstProgramNode();
      if ((localList != null) && (localList.size() > this.mLoadedTotal))
      {
        this.mListView.update("addmore", localList);
        this.mListView.cancelLoadState();
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.headLayout.layoutView(this.mHeadView);
    this.mListView.layout(0, this.headLayout.height, this.standardLayout.width, this.standardLayout.height);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.standardLayout.scaleToBounds(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
    this.headLayout.scaleToBounds(this.standardLayout);
    this.mListView.measure(this.standardLayout.getWidthMeasureSpec(), View.MeasureSpec.makeMeasureSpec(this.standardLayout.height - this.headLayout.height, 1073741824));
    this.headLayout.measureView(this.mHeadView);
    setMeasuredDimension(this.standardLayout.width, this.standardLayout.height);
  }

  public void onNotification(String paramString)
  {
    if (paramString.equalsIgnoreCase("RPS"))
      setProgramList();
  }

  public void onRecvDataException(String paramString, InfoManager.DataExceptionStatus paramDataExceptionStatus)
  {
  }

  public void update(String paramString, Object paramObject)
  {
    if (paramString.equalsIgnoreCase("setData"))
      this.mListView.update(paramString, paramObject);
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.view.playview.PlayListView
 * JD-Core Version:    0.6.2
 */