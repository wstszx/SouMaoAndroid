package duowan.soumao.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xdroidmvp.kit.KnifeKit;
import duowan.soumao.R;
import duowan.soumao.model.GankResults;

/**
 * Created by wanglei on 2016/12/10.
 */

public class MyCenterAdapter extends SimpleRecAdapter<GankResults.Item, MyCenterAdapter.ViewHolder> {

    public static final int TAG_VIEW = 0;

    public MyCenterAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder newViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.adapter_home;
    }

    // TODO: 2017/8/23
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final GankResults.Item item = data.get(position);

        String type = item.getType();
        switch (type) {
//            case "休息视频":
//                holder.rlMessage.setVisibility(View.VISIBLE);
//                holder.ivPart.setVisibility(View.GONE);
//                holder.ivVedio.setVisibility(View.VISIBLE);
//                holder.tvItem.setText(item.getDesc());
//                holder.itemView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (getRecItemClick() != null) {
//
//                        }
//                    }
//                });
//                break;
//            case "福利":
//                holder.rlMessage.setVisibility(View.GONE);
//                holder.ivPart.setVisibility(View.VISIBLE);
//                holder.ivVedio.setVisibility(View.GONE);
//
//                ILFactory.getLoader().loadNet(holder.ivPart, item.getUrl(), null);
//                holder.tvItem.setText("瞧瞧妹纸，扩展扩展视野......");
//                holder.itemView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (getRecItemClick() != null) {
//
//                        }
//                    }
//                });
//                break;
//            default:
//                holder.rlMessage.setVisibility(View.VISIBLE);
//                holder.ivPart.setVisibility(View.GONE);
//                holder.ivVedio.setVisibility(View.GONE);
//                holder.tvItem.setText(item.getDesc());
//                holder.itemView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (getRecItemClick() != null) {
//
//                        }
//                    }
//                });
//                break;
        }
        Uri uri = null;

        String author = item.getWho();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getRecItemClick() != null) {
                    getRecItemClick().onItemClick(position, item, TAG_VIEW, holder);
                }
            }
        });

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);
            KnifeKit.bind(this, itemView);
        }
    }
}
