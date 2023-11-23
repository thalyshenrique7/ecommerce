import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { PedidovendaComponent } from './pedidovenda/pedidovenda.component';
import { ProdutoComponent } from './produto/produto.component';
import { ProdutoService } from './produto/produto.service';

@NgModule({
    declarations: [
        ProdutoComponent,
        PedidovendaComponent,
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        CommonModule,
    ],
    providers: [
        ProdutoService
    ],
    exports: [
        ProdutoComponent
    ]
})
export class EstoqueModule { }