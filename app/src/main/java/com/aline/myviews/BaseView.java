package com.aline.myviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author SuTs
 * @create 2020/12/17 11:11
 * @Describe
 */
public class BaseView extends View {
    public BaseView(Context context) {
        super(context);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //在构造函数中创建对象，避免onDraw中创建，因为重绘时会执行onDraw
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawPoint(100, 100, paint);

        //设置画布即背景颜色
        canvas.drawRGB(96, 96, 96);

        //画圆
//        paint.setStyle(Paint.Style.FILL);
//        paint.setStrokeWidth(20);
//        canvas.drawCircle(190,200,150,paint);

        //画一个线，线的宽度与setStrokeWidth有关，与style无关
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint.setStrokeWidth(20);
//        canvas.drawLine(100,100,200,300,paint);

        //画一个点
        paint.setStrokeWidth(20);
        canvas.drawPoint(100, 100, paint);

        //画矩形
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(10, 10, 100, 100, paint);

//        paint.setStyle(Paint.Style.FILL);
//        RectF rectF = new RectF(210f, 10f, 300f, 100f);
//        canvas.drawRect(rectF, paint);

        //画线
//        Path path = new Path();
//        path.moveTo(10, 10);//移动起始点
//        path.lineTo(10, 100);//将线连接至。。可多次使用
//        path.lineTo(300, 100);
//        path.close();
//        canvas.drawPath(path, paint);

//        Path path = new Path();
//        path.moveTo(100, 100);//起始点
//        path.lineTo(100, 300);
//        path.moveTo(300, 100);//移动起始点
//        path.lineTo(300, 300);
//        path.lineTo(100, 100);
//        canvas.drawPath(path, paint);

        //画弧线
//        Path path1 = new Path();
//        path1.moveTo(10, 10);
//        RectF rectF = new RectF(100, 10, 200, 100);
//        canvas.drawRect(rectF, paint);
//        path1.arcTo(rectF, 0, 90);
//        canvas.drawPath(path1, paint);

        //Region
//        Region region = new Region(new Rect(50, 50, 200, 100));
//        drawRegion(canvas, paint, region);

        //Region取交集,椭圆和矩形的交集
//        paint.setStyle(Paint.Style.FILL);
//        Path ovalPath = new Path();
//        RectF rectF = new RectF(50, 50, 200, 500);//构造一个椭圆区域
//        ovalPath.addOval(rectF, Path.Direction.CCW);
//        Region region = new Region();
//        region.setPath(ovalPath, new Region(50, 50, 200, 200));
//        drawRegion(canvas, paint, region);
//取并集
//        region.set(50, 50, 200, 500);
//        region.union(new Rect(50, 50, 200, 200));

        //区域操作
//        Rect rect1 = new Rect(100, 100, 400, 200);
//        Rect rect2 = new Rect(200, 0, 300, 300);
//        canvas.drawRect(rect1, paint);
//        canvas.drawRect(rect2, paint);
//        Region region1 = new Region(rect1);
//        Region region2 = new Region(rect2);
//        region1.op(region2, Region.Op.INTERSECT);
//        Paint paint_fill = new Paint();
//        paint_fill.setStyle(Paint.Style.FILL);
//        paint_fill.setColor(Color.GREEN);
//        drawRegion(canvas, paint_fill, region1);

        //画布canvas的裁剪,画布裁剪为不可逆操作
//        canvas.drawColor(Color.RED);
//        canvas.clipRect(new Rect(200,200,400,400));
//        canvas.drawColor(Color.GREEN);
        //画布的保存与恢复
        canvas.drawColor(Color.RED);
        canvas.save();
        canvas.clipRect(new Rect(200, 200, 400, 400));
        canvas.drawColor(Color.GREEN);
        canvas.restore();//每次restore会恢复save的最顶层canvas
        canvas.drawColor(Color.BLUE);
    }

    private void drawRegion(Canvas canvas, Paint paint, Region region) {
        Rect rect = new Rect();
        RegionIterator iterator = new RegionIterator(region);
        while (iterator.next(rect)) {
            canvas.drawRect(rect, paint);
        }
    }
}
